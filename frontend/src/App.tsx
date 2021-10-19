import DataTable from "./components/data-table";
import Footer from "./components/footer";
import NavBar from "./components/nav-bar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary">Dashboard</h1>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
