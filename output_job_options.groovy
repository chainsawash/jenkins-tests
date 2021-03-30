pipeline {
    agent any
    stages {
        stage('Example') {
             def channels = params.CHANNELS.split(",")
             channels.each { channel ->
                 steps {
                     echo "Your choice is ${channel}"
                 }
             }
        }
    }
}
