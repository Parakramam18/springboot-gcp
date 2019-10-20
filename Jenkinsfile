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

        stage('Build Docker image')
        {
              app = docker.build("gcr.io/govindacloud09072019/sb-gcp-jenkins")
        }
        stage('Push image')
        {
              docker.withRegistry('https://us.gcr.io', 'gcr-id') {
                app.push("${env.BUILD_NUMBER}")
                app.push("latest")
              }
            }




 }
}