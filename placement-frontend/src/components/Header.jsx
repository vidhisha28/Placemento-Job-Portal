function Header(){
    const uname=sessionStorage.getItem("uname")
    return (
<div className="jumbotron p-3 mb-0 bg-dark text-white rounded-0">
    <h5 className="float-right m-2">Welcome ! {uname}</h5>
    <h2 className="text-center">Placemento</h2>
</div>
    )}

export default Header;