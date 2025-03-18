function fetchEvents() {
    fetch('/api/events')
        .then(response => response.json())
        .then(events => {
            const eventList = document.getElementById('event-list');
            eventList.innerHTML = '';
            events.forEach(event => {
                const li = document.createElement('li');
                li.textContent = `${event.name} - ${event.location} on ${event.date}`;
                eventList.appendChild(li);
            });
        });
}
