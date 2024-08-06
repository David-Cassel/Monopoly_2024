document.getElementById('subtractForm').addEventListener('submit', function(event) {
    event.preventDefault();

    const a = document.getElementById('a').value;
    const b = document.getElementById('b').value;

    fetch(`http://localhost:8080/subtract?a=${a}&b=${b}`)
        .then(response => response.text())
        .then(data => {
            document.getElementById('result').innerText = `Result: ${data}`;
        })
        .catch(error => {
            console.error('Error:', error);
            document.getElementById('result').innerText = 'Error occurred';
        });
});