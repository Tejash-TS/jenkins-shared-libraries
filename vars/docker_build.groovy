def call(String Projectname ,String imageTag ,String DockerHubUser){
sh "docker build -t ${DockerHubUser}/${Projectname}:${ImageTag} ."
}
