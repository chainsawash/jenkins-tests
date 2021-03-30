pipelineJob('job-with-options') {

  description('Testing options')

  configure {
    project->
      project / 'properties' << 'hudson.model.ParametersDefinitionProperty' {
        parameterDefinitions {
          'com.cwctravel.hudson.plugins.extended__choice__parameter.ExtendedChoiceParameterDefinition' {
            name 'CHANNELS'
            quoteValue 'false'
            saveJSONParameterToFile 'false'
            visibleItemCount '10'
            type 'PT_CHECKBOX'
            value "dev-team," +
                  "po-helpline," +
                  "parrots," +
                  "team-elephants," +
                  "team-marmots," +
                  "team-skinks," +
                  "team-spiders," +
                  "team-turtles," +
                  "team-woodchucks," +
                  "snuffertest," +
                  "qe-team," +
                  "erik-test-003"
            defaultValue "dev-team," +
                         "po-helpline"
            multiSelectDelimiter ','
            projectName "options_job_name"
          }
        }
      }
  }

  definition {
    cpsScm {
      lightweight(true)
      scm {
        git {
          branch('master')
          remote {
            url('https://github.com/chainsawash/jenkins-tests')
          }
        }
      }
      scriptPath('output_job_options.groovy')
    }
  }
}
