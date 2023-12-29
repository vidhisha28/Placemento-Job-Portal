import { Link } from "react-router-dom";
import { HashLink } from "react-router-hash-link";

const TopNavbar = () => {
  return (
    <>
      <nav className="navbar navbar-expand-lg navbar-light bg-light fixed-top">
        <HashLink className="navbar-brand" to="/#">
          Placemento 
        </HashLink>
        <button
          className="navbar-toggler"
          type="button"
          data-toggle="collapse"
          data-target="#navbarNav"
          aria-controls="navbarNav"
          aria-expanded="false"
          aria-label="Toggle navigation"
        >
          <span className="navbar-toggler-icon" />
        </button>
        <div className="collapse navbar-collapse" id="navbarNav">
          <ul className="navbar-nav">
            <li className="nav-item active">
              <HashLink className="nav-link" to="/#top" smooth>
                Home <span className="sr-only">(current)</span>
              </HashLink>
            </li>
            <li className="nav-item">
              <HashLink className="nav-link" to="/#about" smooth>
                About Us
              </HashLink>
            </li>
            <li className="nav-item">
              <HashLink className="nav-link" to="/#events" smooth>
                Timeline
              </HashLink>
            </li>
            <li className="nav-item">
              <HashLink className="nav-link" to="/#faq" smooth>
                FAQs
              </HashLink>
            </li>
            <li className="nav-item">
              <HashLink className="nav-link" to="/blogs" smooth>
                Blogs
              </HashLink>
            </li>
            <li className="nav-item">
              <Link className="nav-link" to="/login">
                Login
              </Link>
            </li>
           
          </ul>
        </div>
      </nav>
    </>
  );
};

export default TopNavbar;
