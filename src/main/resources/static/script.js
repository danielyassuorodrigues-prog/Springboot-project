function enviar() {
    const dados = {
        clientName: document.getElementById("nome").value,
        phone: document.getElementById("telefone").value,
        service: document.getElementById("servico").value,
        date: document.getElementById("data").value,
        hour: document.getElementById("hora").value
    };

    fetch("http://localhost:8081/appointments", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(dados)
    })
    .then(res => res.json())
    .then(resp => {
        alert("Agendamento feito com sucesso!");
        console.log(resp);
    })
    .catch(err => {
        console.log("Erro:", err);
        alert("Erro ao agendar");
    });
}