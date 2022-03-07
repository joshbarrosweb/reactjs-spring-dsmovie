import "./styles.css";

function Navbar () {

    return (
        <header>
        <nav className="container">
          <div className="dsmovie-nav-content">
            <h1>DSMovie</h1>
            <a href="https://github.com/joshbarrosweb">
              <div className="dsmovie-contact-container">
                <p className="dsmovie-contact-link">/joshbarrosweb</p>
              </div>
            </a>
          </div>
        </nav>
      </header>
    );
}

export default Navbar;