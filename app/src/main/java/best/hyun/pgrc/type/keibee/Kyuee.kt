package best.hyun.pgrc.type.keibee

import best.hyun.pgrc.App
import best.hyun.pgrc.R
import best.hyun.pgrc.type.ELEMENTAL
import best.hyun.pgrc.type.PET_TYPE
import best.hyun.pgrc.type.Pet
import best.hyun.pgrc.type.getSerialNumber

class Kyuee : Pet() {
    override val serialnumber: Int
        get() = getSerialNumber(name)
    override val name: String
        get() = App.getString(R.string.name_kyuee)
    override val type: PET_TYPE
        get() = PET_TYPE.KEIBEE
    override var reincarnation: Boolean = false
    override val getRoute: String
        get() = App.getString(R.string.route_kyuee)
    override val mainElemental: ELEMENTAL
        get() = ELEMENTAL.FIRE
    override val subElemental: ELEMENTAL?
        get() = ELEMENTAL.WIND
    override val mainElementalValue: Int
        get() = 50
    override val subElementalValue: Int
        get() = 50
    override val initLv: Int
        get() = 1
    override val maxLv: Int
        get() = 140
    override val initLvMaxHp: Int
        get() = 23
    override val initLvMaxAtk: Int
        get() = 4
    override val initLvMaxDef: Int
        get() = 4
    override val initLvMaxSpd: Int
        get() = 4
    override val maxLvMaxHp: Int
        get() = 1193
    override val maxLvMaxAtk: Int
        get() = 244
    override val maxLvMaxDef: Int
        get() = 222
    override val maxLvMaxSpd: Int
        get() = 241
    override val initLvMinHp: Int
        get() = 16
    override val initLvMinAtk: Int
        get() = 3
    override val initLvMinDef: Int
        get() = 3
    override val initLvMinSpd: Int
        get() = 3
    override val maxLvMinHp: Int
        get() = 947
    override val maxLvMinAtk: Int
        get() = 199
    override val maxLvMinDef: Int
        get() = 177
    override val maxLvMinSpd: Int
        get() = 204
    override val minAllGrowth: Double
        get() = 4.151
    override val maxAllGrowth: Double
        get() = 4.998
}