
public interface IEntityRepository<T extends IEntityGeneric> {
	public void add(T entity);
	public void remove(T entity);
	public void update(T entity);
	public void delete(T entity);
}
