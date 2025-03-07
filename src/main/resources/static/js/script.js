document.addEventListener('DOMContentLoaded', function() {
    // Inicializar AOS (Animate On Scroll)
    AOS.init({
        duration: 1000,   // Duración de las animaciones (en ms)
        once: true,        // Solo animar una vez al hacer scroll
        easing: 'ease-in-out', // Efecto de aceleración
    });

    console.log('AOS inicializado correctamente');

    // Autocompletado de redes sociales (Contacto)
    const redes = ["instagram", "twitter", "skype"];
    redes.forEach((id) => {
        const input = document.getElementById(id);
        if (input) {
            input.addEventListener("blur", function () {
                if (input.value && !input.value.startsWith("@")) {
                    input.value = "@" + input.value;
                }
            });
        }
    });

    // Efecto de agrandar imagen de perfil al pasar el ratón
    const imagenPerfil = document.querySelector(".grid");
    if (imagenPerfil) {
        imagenPerfil.style.transition = "transform 0.3s ease";
        imagenPerfil.addEventListener("mouseover", function () {
            imagenPerfil.style.transform = "scale(1.1)";
        });
        imagenPerfil.addEventListener("mouseout", function () {
            imagenPerfil.style.transform = "scale(1)";
        });
    }
});
