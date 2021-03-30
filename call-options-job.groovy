pipeline {
  agent any
  stages {
    stage('Call Options Job'){
      def build = build job:
        'job-with-options',
        wait: false,
        parameters: [
          extendedChoice(name: 'CHANNELS', value: 'dev-team,team-spiders'),
        ]
    }
  }
}
