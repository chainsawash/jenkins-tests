pipeline {
    agent any

    stage('Getting options') {
        def channels = params.CHANNELS.split(",")
        channels.each { channel ->
          shell('echo ${channel}!')
        }
    }

    post{
        success{
            echo "Done :)"
        }
    }
}
