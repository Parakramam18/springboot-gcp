pipeline
  {
  agent any
  tools {
      jdk 'JAVA_HOME'
    }
  stages
  {
  stage ('Compile maven spring-boot')
   {
   steps
   {
   withMaven(maven:'Maven')
   {
   bat 'mvn clean compile'
   }
   }

   }


   stage ('package maven spring-boot')
     {
      steps
       {
           withMaven(maven:'Maven')
               {
                   bat 'mvn package -Dmaven.test.skip=true'
               }
      }
     }


        stage ('push to cloud Foundry')
          {
           steps
            {
                withCredentials([[$class :'UsernamePasswordMultiBinding',
                credentialsId : 'PCF_LOGIN',
                usernameVariable: 'USERNAME',
                passwordVariable: 'PASSWORD']])
                    {
                        bat 'E://software//CloudFoundry/cf login -a api.run.pivotal.io -u $USERNAME -p $PASSWORD'
                        bat 'E://software//CloudFoundry/cf push'
                    }
           }
          }


 }
}