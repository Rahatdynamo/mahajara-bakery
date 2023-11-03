const express = require('express');
const connection = require('./getApi');

const app = express();
const PORT = process.env.PORT || 3002;

// Middleware to parse JSON
app.use(express.json());

// Define routes
app.get('/api/Breads', (req, res) => {
  connection.query('SELECT * FROM cake WHERE cake_type LIKE "Breads"', (error, results) => {
    if (error) {
      res.status(500).json({ error: error.message });
      return;
    }
    res.json({ users: results });
  });
});
app.get('/api/BirthdayCake', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Birthday Cake"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/RichPlumCake', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Rich Plum Cake"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Beverages', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Beverages"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Chat', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Chat"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Cookies', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Cookies"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Pastries', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Pastries"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Puffs', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Puffs"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Rusks', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Rusks"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Savouries', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Savouries"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Snacks', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Snacks"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });
  app.get('/api/Sweets', (req, res) => {
    connection.query('SELECT * FROM cake WHERE cake_type LIKE "Sweets"', (error, results) => {
      if (error) {
        res.status(500).json({ error: error.message });
        return;
      }
      res.json({ users: results });
    });
  });

// Start the server
app.listen(PORT, () => {
  console.log(`Server is running on http://localhost:${PORT}`);
});