const express = require('express');
const bodyParser = require('body-parser');
const nodemailer = require('nodemailer');

const app = express();
app.use(bodyParser.urlencoded({ extended: true }));
app.use(express.static('public')); // Serve static files (like HTML)

// Array to store messages
const messages = [];

// Route to handle contact form submission
app.post('/contact', (req, res) => {
    const { name, email, message } = req.body;

    // Store the message
    messages.push({ name, message });

    // Set up nodemailer to send an email
    const transporter = nodemailer.createTransport({
        service: 'Gmail',
        auth: {
            user: 'your-email@gmail.com',
            pass: 'your-email-password'
        }
    });

    const mailOptions = {
        from: email,
        to: 'your-email@gmail.com',
        subject: `New Contact Message from ${name}`,
        text: message
    };

    transporter.sendMail(mailOptions, (error, info) => {
        if (error) {
            return res.status(500).send('Error sending email');
        }
        res.status(200).send('Message sent successfully');
    });
});

// Route to serve messages to the frontend
app.get('/messages', (req, res) => {
    res.json(messages);
});

app.listen(3000, () => {
    console.log('Server started on http://localhost:3000');
});
