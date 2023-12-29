import Aboutus from "./Aboutus";
import Blogs from "./Blogs";
import Carausel from "./Carausel";
import Events from "./Events";
import FAQs from "./FAQs";
import TopNavbar from "./TopNavbar";

function HomePage(){
    return (
        <div>
            <TopNavbar />
            
            <Carausel />
            <div className="container">
                <div id="about" className="pt-5">
                    <Aboutus/>
                </div>
                <div id="events" className="pt-5">
                    <Events />
                </div>
                <div id="faq" className="pt-5">
                    <FAQs />
                </div>
                
            </div>
        </div>
        )
    }
export default HomePage;