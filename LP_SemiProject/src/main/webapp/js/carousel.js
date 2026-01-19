document.addEventListener("DOMContentLoaded", function () {

  let index = 0;

  const track = document.querySelector(".carousel-track");
  
  const items = document.querySelectorAll(".carousel-item");

  if (!track || items.length === 0) return;

  const itemWidth = 260; 

  const visibleItems = 4;
  
  let maxIndex = items.length - visibleItems;

  if (maxIndex < 0) maxIndex = 0;

  document.querySelector(".next").addEventListener("click", () => {
    // maxIndex까지만 index가 증가하도록 제한
    if (index < maxIndex) {
      index++;
      track.style.transform = `translateX(-${index * itemWidth}px)`;
    }
  });

  document.querySelector(".prev").addEventListener("click", () => {
    if (index > 0) {
      index--;
      track.style.transform = `translateX(-${index * itemWidth}px)`;
    }
  });
});