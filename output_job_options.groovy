stages {
    stage('Getting options') {
        steps {
            def channels = params.CHANNELS.split(",")
            channels.each { channel ->
                sh 'echo "Item is $channel"'
            }
        }
    }
}
