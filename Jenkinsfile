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

    stage('Trigger ECS Deployment') {
        steps {
            echo '✅ Triggering ECS Deployment...'
            sh '''
                aws ecs update-service \
                    --cluster java-asg-cluster \
                    --service java-docker-task-service-rla7xzkg \
                    --force-new-deployment \
                    --region us-east-1
            '''
        }
    }
}
}
