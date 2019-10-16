Pipeline
  {
  agent any
  Stages
  {
  stage ('Compile maven spring-boot')
   {
   steps
   {
   withMaven(maven : 'Maven')
   {
   sh 'mvn clean compile'
   }
   }

   }


   stage ('package maven spring-boot')
  {
   steps
    {
        withMaven(maven : 'Maven')
            {
                sh 'mvn package -Dmaven.test.skip=true'
            }
   }
  }
 }
}