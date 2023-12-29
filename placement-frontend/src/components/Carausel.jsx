const Carausel = () => {
    return (
        <div id="top">
        <h4>Carausel</h4>
        <div id="carouselExampleControls" className="carousel slide" data-ride="carousel">
  <div className="carousel-inner">
    <div className="carousel-item active">
      <img src="images/lib1.jpg" className="d-block w-100" alt="..." />
    </div>
    <div className="carousel-item">
      <img src="images/Main-page.png" className="d-block w-100" alt="..." />
    </div>
    <div className="carousel-item">
      <img src="images/tiet1.jpg" className="d-block w-100" alt="..." />
    </div>
  </div>
  <button className="carousel-control-prev" type="button" data-target="#carouselExampleControls" data-slide="prev">
    <span className="carousel-control-prev-icon" aria-hidden="true" />
    <span className="sr-only">Previous</span>
  </button>
  <button className="carousel-control-next" type="button" data-target="#carouselExampleControls" data-slide="next">
    <span className="carousel-control-next-icon" aria-hidden="true" />
    <span className="sr-only">Next</span>
  </button>
</div>

        </div>
    )
}

export default Carausel;