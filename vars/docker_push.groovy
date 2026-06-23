def call(String Project ,String ImageTag,String dockerhubuser){
 echo "pushing the image to docker hub"
                  withCredentials([
                      usernamePassword(
                          credentialsId:"dockerHubCred",
                          passwordVariable:"dockerHubPass",
                          usernameVariable:"dockerHubUser")]){
                  sh "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPass}"     //"-u tejash727 -p myPW"
                  sh "docker image tag notes-app:latest ${env.dockerHubUser}/notes-app:latest"
                  sh "docker push ${env.dockerHubUser}/notes-app:latest"
}
