pipelineJob('dsl_job_example') {
    definition {
        cps {
            script(readFileFromWorkspace('desire_pipeline.groovy'))
            sandbox()
        }
    }
}
