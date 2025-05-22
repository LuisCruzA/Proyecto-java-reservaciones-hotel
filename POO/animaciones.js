<!-- Esto va al final de index.html -->
<script>
  const animados = document.querySelectorAll('.animado');

  const observer = new IntersectionObserver(entries => {
    entries.forEach(entry => {
      if (entry.isIntersecting) {
        entry.target.style.opacity = 1;
        entry.target.style.animationPlayState = 'running';
        observer.unobserve(entry.target);
      }
    });
  }, {
    threshold: 0.1
  });

  animados.forEach(el => {
    el.style.animationPlayState = 'paused';
    observer.observe(el);
  });
</script>
</body>
</html>
