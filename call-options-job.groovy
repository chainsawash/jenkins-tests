pipeline {
  agent any
  stages {
    stage('Call Options Job'){
      steps {
        build job:'job-with-options',
          wait: false,
          parameters: [
            extendedChoice(name: 'CHANNELS', value: 'dev-team,team-spiders'),
          ]
      }
    }
  }
}
