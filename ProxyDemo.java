package test1;

interface Network {
	public void browse();
}

class Real implements Network {
	public void browse() {
		System.out.println("���������Ϣ ");
	}
}

class Proxy implements Network {
	private Network network;

	public Proxy(Network network) {
		this.network = network;
	}

	public void check() {
		System.out.println("����û��Ƿ�Ϸ� ");
	}

	public void browse() {
		this.check();
		this.network.browse();
	}
}

public class ProxyDemo {
	public static void main(String[] args) {
		Network net = null;
		net = new Proxy(new Real());
		net.browse();
	}
}