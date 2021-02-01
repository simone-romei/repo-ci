pipeline {
    agent any 
    stages {
        stage('prepare') {
            steps {
                echo 'Hello world!' 
            }
        }
    }
}