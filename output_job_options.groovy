pipeline {
    agent any
    stages {
        stage('Example') {
            steps {
                script {
                    def channels = params.CHANNELS.split(",")
                    channels.each { channel ->
                        echo "Your choice is ${channel}"
                    }
                }
             }
        }
    }
}
