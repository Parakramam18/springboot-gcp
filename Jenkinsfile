pipeline
  {
  agent any
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
 }
}