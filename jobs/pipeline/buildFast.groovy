pipelineJob('commerce pipeline - build fast') {
    description("Pipelina job for build fast commerce suite")
    definition {
        cpsScm {
            scm {
                git('https://github.com/simone-romei/repo-ci')
            }
            scriptPath('/jobs/dsl/buildFast.jenkins') 
        }
    }
}