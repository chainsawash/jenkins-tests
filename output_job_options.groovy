pipeline {
    agent any

    stages {
        stage('Getting options') {
            steps {
                def channels = params.CHANNELS.split(",")
                channels.each { channel ->
                    echo ${channel}
                }
            }
        }
    }
}
