/* groovylint-disable CompileStatic */
pipelineJob('commerce pipeline - build fast') {
    description('Pipelina job for build fast commerce suite')
    definition {
        cps {
            script('''
                @Library('commerce-library') _
                pipeline {
                    agent any
                    stages {
                        stage('Stage 1') {
                            steps {
                                echo 'stage1'
                                commerceSetup()
                            }
                        }
                        stage('Stage 2') {
                            steps {
                                echo 'stage2'
                                commerceAnt()
                            }
                        }
                    }
                }
        '''.stripIndent())
        sandbox()
        }
    }
}
