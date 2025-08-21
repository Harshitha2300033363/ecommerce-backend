pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                bat 'mvn clean install "-Dspring.profiles.active=test"'
            }
        }
    }
}
