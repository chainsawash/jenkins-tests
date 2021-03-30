pipeline {
    agent any

    stages {
        stage('Getting options') {
            script {
                def channels = params.CHANNELS.split(",")
                channels.each { channel ->
                    echo ${channel}
                }
            }
        }
    }
}
