const mysql = require('mysql2');

const connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'aftab@7890',
  database: 'bakery'
});

module.exports = connection;