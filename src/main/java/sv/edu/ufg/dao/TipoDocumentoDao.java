
package sv.edu.ufg.dao;
import sv.edu.ufg.model.TipoDocumento;
import java.util.List;
/**
 *
 * @author Daniel
 */
public interface TipoDocumentoDao {
    public void create(TipoDocumento r);
	public void update(TipoDocumento r);
	public void delete(TipoDocumento r);
	public TipoDocumento find(int id);
	public List<TipoDocumento> findAll();
}
