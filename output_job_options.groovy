pipeline {
    agent any

    stages {
        stage('Getting options') {
            steps {
                script {
                    def channels = params.CHANNELS.split(",")
                    channels.each { channel ->
                        shell('echo ${channel}')
                    }
                }
            }
        }
    }
}
