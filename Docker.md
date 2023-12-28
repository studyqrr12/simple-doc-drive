# MariaDB 

docker pull mariadb

docker run --name mariadb-simple-docs-drive -d -p 3306:3306 --restart=always -e MYSQL_ROOT_PASSWORD=root mariadb