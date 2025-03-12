document.addEventListener('DOMContentLoaded', function() {
    // Inicializar AOS (Animate On Scroll)
    AOS.init({
        duration: 1000,
        once: true,
        easing: 'ease-in-out',
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

    // Efecto en iconos del footer
    const redesFooter = document.querySelectorAll("footer .fab");
    redesFooter.forEach(icono => {
        icono.style.transition = "transform 0.3s ease, color 0.3s ease";
        
        icono.addEventListener("mouseover", function () {
            icono.style.transform = "scale(1.2)";
            icono.style.color = "#ffcc00";
        });

        icono.addEventListener("mouseout", function () {
            icono.style.transform = "scale(1)";
            icono.style.color = "white";
        });
    });

    // Efecto de escritura en el encabezado
    function efectoEscritura() {
        const tituloElemento = document.getElementById("tituloEscritura");
        if (!tituloElemento) return;

        const textoTitulo = tituloElemento.textContent.trim();
        tituloElemento.textContent = "";
        let index = 0;

        function escribirTitulo() {
            if (index < textoTitulo.length) {
                tituloElemento.textContent += textoTitulo.charAt(index);
                index++;
                setTimeout(escribirTitulo, 100); // Velocidad de escritura
            }
        }

        escribirTitulo();
    }

    // Iniciar el efecto de escritura
    efectoEscritura();
});