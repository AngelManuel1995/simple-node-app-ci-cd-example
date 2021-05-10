job('NodeJS-example') {
    scm {
        git('https://github.com/AngelManuel1995/simple-node-app-ci-cd-example.git') {  node -> // is hudson.plugins.git.GitSCM
            node / gitConfigName('DSL User')
            node / gitConfigEmail('angelmanuel.goez@hotmail.es')
        }
    }
    triggers {
        scm('H/5 * * * *')
    }
    wrappers {
        nodejs('N16.1.0') // this is the name of the NodeJS installation in 
                         // Manage Jenkins -> Configure Tools -> NodeJS Installations -> Name
    }
    steps {
        shell("npm install")
    }
}
