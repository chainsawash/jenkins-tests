pipeline {
    agent any

    stages {
        stage('Getting options') {
            step {
                script {
                    def channels = params.CHANNELS.split(",")
                    channels.each { channel ->
                        echo ${channel}
                    }
                }
            }
        }
    }
}
