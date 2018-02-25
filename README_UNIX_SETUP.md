sudo adduser $USER
sudo usermod -aG sudo $USER
su - $USER
sudo apt-get update
sudo apt-get install
sudo apt-get install aptitude
sudo apt-get install emacs
sudo apt-get install vim
sudo apt-get install tree
sudo apt-get install htop
sudo apt-get install docker.io
sudo aptitude install python-pip

sudo apt-get update -y
sudo apt-get upgrade -y
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update -y
sudo apt-get install oracle-java8-installer
java -version
wget http://www-eu.apache.org/dist/maven/maven-3/3.3.9/binaries/apache-maven-3.3.9-bin.tar.gz
sudo tar -xvzf apache-maven-3.3.9-bin.tar.gz
sudo mv apache-maven-3.3.9 maven
sudo vim /etc/profile.d/mavenenv.sh
export M2_HOME=/opt/maven
export PATH=${M2_HOME}/bin:${PATH}

sudo chmod +x /etc/profile.d/mavenenv.sh
sudo source /etc/profile.d/mavenenv.sh

mvn --version

vim .bashrc
M2_HOME=/
MAVEN_HOME=/
JAVA_HOME=/
source .bashrc
mvn --version


sudo setfacl -m user:${USER_NAME}:rw /var/run/docker.sock
sudo systemctl enable docker