dev buildJar() {
    sh 'mvn package'
    echo 'building jar file'
}
dev testApp() {
    echo 'testing jar file'
}
dev buildImage() {
    withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')])
        sh 'docker build -t zahranjamali/java-maven-app:1.1 .'
        sh "echo $PASS | docker login -u $USER --password-stdin "                   //credential should be available in Jenkins eg. docker-hub-repo
        sh "docker push zahranjamali/java-maven-app:1.1"
        echo 'building jar file'
}
dev buildJar() {
    sh 'mvn package'
    echo 'building jar file'
}
dev deploy() {
    echo 'deploying jar file'
}
return this