pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building project...'
                sh './gradlew clean build'
            }
        }
        stage('Test') {
            steps {
                echo 'Running tests...'
                sh './gradlew test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Build complete! Jar file created in build/libs'
            }
        }
    }
}
