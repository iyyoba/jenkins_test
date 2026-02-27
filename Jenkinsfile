pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                 git branch: 'main',
                            url: 'https://github.com/iyyoba/jenkins_test.git'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean install' // sh for linux and ios
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Code Coverage') {
            steps {
                sh 'mvn jacoco:report'
            }
        }
        stage('Publish Test Results') {
            steps {
                junit 'jenkins-test/target/surefire-reports/TEST-TempConverterTest.xml'
            }
        }
        stage('Publish Coverage Report') {
            steps {
                jacoco()
            }
        }
    }
}