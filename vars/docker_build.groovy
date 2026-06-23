def call(String Projectname String imageTag ,string DockerHubUser){
sh "docker build -t ${DockerHubUser}/${Projectname}:${ImageTag} ."
}
