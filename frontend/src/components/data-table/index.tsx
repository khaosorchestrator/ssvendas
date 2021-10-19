const DataTable = () => {
  return (
    <div className="table-responsive">
      <table className="table table-striped table-sm">
        <thead>
          <tr>
            <th>Data</th>
            <th>Vendedor</th>
            <th>Clientes visitados</th>
            <th>Negócios fechados</th>
            <th>Valor</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>24/10/2021</td>
            <td>Albertina Almeida</td>
            <td>3</td>
            <td>25</td>
            <td>1500 USD</td>
          </tr>
          <tr>
            <td>24/09/2021</td>
            <td>Isabel Fuxe</td>
            <td>2</td>
            <td>25</td>
            <td>1100 USD</td>
          </tr>
          <tr>
            <td>01/01/2021</td>
            <td>Rossana Tony</td>
            <td>3</td>
            <td>25</td>
            <td>1100 USD</td>
          </tr>
        </tbody>
      </table>
    </div>
  );
}

export default DataTable;