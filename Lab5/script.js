let secondsSpent = 0;

    function updateTime() {
      secondsSpent++;
      const hours = Math.floor(secondsSpent / 3600);
      const minutes = Math.floor((secondsSpent % 3600) / 60);
      document.getElementById("timeSpent").textContent = `${hours}hr ${minutes}min watched`;
    }

    setInterval(updateTime, 1000); 