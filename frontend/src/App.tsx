import BarChart from "components/BarChart";
import DataTable from "components/DataTable";
import DonuChart from "components/DonuChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";

function App() {
  return (
    <>
      <NavBar />
      <div className="container">
        <h1 className="text-primary py-3">Dashboard de Ventas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Tasa de Exito (%)</h5>
            <BarChart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secondary">Toodas las Ventas</h5>
            <DonuChart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">Todas las Ventas</h2>
        </div>
        
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
