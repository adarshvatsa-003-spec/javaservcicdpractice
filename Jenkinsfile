pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo '✅ Running Maven build...'
                sh 'mvn clean package'
            }
        }

        stage('Test') {
            steps {
                echo '✅ (Optional) Run tests here'
            }
        }

        stage('Deploy') {
            steps {
                echo '✅ (Placeholder) Docker build & ECR push later'
            }
        }
    }
}
