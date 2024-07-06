// scripts.js

const quizForm = document.getElementById('quizForm');

quizForm.addEventListener('submit', function(event) {
    event.preventDefault();
    
    const quizTitle = document.getElementById('quizTitle').value;
    const quizDescription = document.getElementById('quizDescription').value;

    const quizData = {
        title: quizTitle,
        description: quizDescription
    };

    fetch('/api/quizzes', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(quizData)
    })
    .then(response => response.json())
    .then(data => {
        alert('Quiz created successfully!');
        console.log(data);
    })
    .catch(error => {
        console.error('Error:', error);
    });
});
